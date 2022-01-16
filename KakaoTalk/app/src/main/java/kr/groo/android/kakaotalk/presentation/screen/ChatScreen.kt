package kr.groo.android.kakaotalk.presentation.screen

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import kr.groo.android.kakaotalk.R
import kr.groo.android.kakaotalk.model.Chat
import kr.groo.android.kakaotalk.util.sampleChatData

@Composable
fun ChatScreen() {

    val context = LocalContext.current
    
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(R.string.opponent_name),
                        color = Color.Black
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { showToastMsg(context, R.string.back_toast_msg) }) {
                        Icon(
                            painter = painterResource(R.drawable.ic_back),
                            contentDescription = null,
                            tint = Color.Black
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { showToastMsg(context, R.string.search_toast_msg) }) {
                        Icon(
                            painter = painterResource(R.drawable.ic_search),
                            contentDescription = null,
                            tint = Color.Black
                        )
                    }
                    IconButton(onClick = { showToastMsg(context, R.string.more_toast_msg) }) {
                        Icon(
                            painter = painterResource(R.drawable.ic_more),
                            contentDescription = null,
                            tint = Color.Black
                        )
                    }
                },
                backgroundColor = Color(ContextCompat.getColor(context, R.color.chatBackground)),
            )
        },
        bottomBar = { ChatInputBox() },
        backgroundColor = Color(ContextCompat.getColor(context, R.color.chatBackground))
    ) {
        Conversation(sampleChatData)
    }
}

@Composable
fun Conversation(chats: List<Chat>) {
    LazyColumn(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .padding(bottom = 70.dp)
    ) {
        items(chats) { chat ->
            if (chat.isOpponent)
                OpponentChatCard(chat)
            else
                MyChatCard(chat)
        }
    }
}

/***
 * 상대방 채팅 UI
 */
@Composable
fun OpponentChatCard(chat: Chat) {

    val context = LocalContext.current

    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(all = 10.dp)) {
        Image(
            painter = painterResource(chat.profileImg),
            contentDescription = null,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .clickable(
                    onClick = { showToastMsg(context, R.string.profile_toast_msg) }
                )
        )

        Spacer(modifier = Modifier.width(5.dp))

        Column {
            Text(chat.userName)
            Surface(
                modifier = Modifier
                    .padding(top = 2.dp)
                    .pointerInput(Unit) {
                        detectTapGestures(
                            onLongPress = { showToastMsg(context, R.string.content_toast_msg) }
                        )
                    },
                shape = RoundedCornerShape(6.dp),
                color = Color(ContextCompat.getColor(context, R.color.opponentChatContentBackground))
            ) {
                when (chat.contentType) {
                    Chat.ContentType.TEXT -> Text(
                        text = chat.contentText.toString(),
                        modifier = Modifier.padding(all = 4.dp)
                    )
                    Chat.ContentType.IMG -> Image(
                        painter = painterResource(chat.contentImg ?: R.drawable.img_404),
                        contentDescription = null,
                        modifier = Modifier.size(150.dp)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.width(2.dp))

        Text(
            text = chat.sendAt,
            fontSize = 8.sp,
            color = Color(ContextCompat.getColor(context, R.color.chatSendAtTextColor)),
            modifier = Modifier.align(Alignment.Bottom)
        )
    }
}

/***
 * 본인 채팅 UI
 */
@Composable
fun MyChatCard(chat: Chat) {

    val context = LocalContext.current

    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(all = 10.dp),
        horizontalArrangement = Arrangement.End
    ) {
        Text(
            text = chat.sendAt,
            fontSize = 8.sp,
            color = Color(ContextCompat.getColor(context, R.color.chatSendAtTextColor)),
            modifier = Modifier.align(Alignment.Bottom)
        )

        Spacer(modifier = Modifier.width(2.dp))

        Column {
            Surface(
                modifier = Modifier
                    .padding(top = 2.dp)
                    .pointerInput(Unit) {
                        detectTapGestures(
                            onLongPress = { showToastMsg(context, R.string.content_toast_msg) }
                        )
                    },
                shape = RoundedCornerShape(6.dp),
                color = Color(ContextCompat.getColor(context, R.color.myChatContentBackground))
            ) {
                when (chat.contentType) {
                    Chat.ContentType.TEXT -> Text(
                        text = chat.contentText.toString(),
                        modifier = Modifier.padding(all = 4.dp)
                    )
                    Chat.ContentType.IMG -> Image(
                        painter = painterResource(chat.contentImg ?: R.drawable.img_404),
                        contentDescription = null,
                        modifier = Modifier.size(150.dp)
                    )
                }
            }
        }
    }
}

/***
 * 채팅 입력창 UI
 */
@Composable
fun ChatInputBox() {

    val context = LocalContext.current

    Row(
        modifier = Modifier.background(Color.White),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(R.drawable.ic_add_box),
            contentDescription = null,
            modifier = Modifier
                .padding(
                    horizontal = 10.dp,
                    vertical = 5.dp
                )
                .clickable(
                    onClick = { showToastMsg(context, R.string.more_toast_msg) }
                ),
            colorFilter = ColorFilter.tint(Color.Gray)
        )

        var text by rememberSaveable { mutableStateOf("") }

        TextField(
            value = text,
            onValueChange = { text = it },
            modifier = Modifier
                .weight(1F)
                .padding(vertical = 5.dp),
            singleLine = true,
            shape = RoundedCornerShape(20.dp),
            colors = TextFieldDefaults.textFieldColors(
                textColor = Color.Black,
                backgroundColor = Color.LightGray,
                cursorColor = Color.Black,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
            )
        )

        Image(
            painter = painterResource(R.drawable.ic_send),
            contentDescription = null,
            modifier = Modifier
                .padding(
                    horizontal = 10.dp,
                    vertical = 5.dp
                )
                .clickable(
                    onClick = { showToastMsg(context, R.string.send_toast_msg) }
                ),
            colorFilter = ColorFilter.tint(Color.Gray)
        )
    }
}

private fun showToastMsg(context: Context, resId: Int) {
    Toast.makeText(context, context.getString(resId), Toast.LENGTH_SHORT).show()
}

@Preview
@Composable
fun PreviewChatScreen() {
    ChatScreen()
}

@Preview
@Composable
fun PreviewOpponentChatCard() {
    OpponentChatCard(sampleChatData[0])
}

@Preview
@Composable
fun PreviewMyChatCard() {
    MyChatCard(sampleChatData[0])
}

@Preview
@Composable
fun PreviewChatInputBox() {
    ChatInputBox()
}