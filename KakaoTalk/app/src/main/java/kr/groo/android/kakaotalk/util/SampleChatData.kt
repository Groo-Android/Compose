package kr.groo.android.kakaotalk.util

import kr.groo.android.kakaotalk.R
import kr.groo.android.kakaotalk.model.Chat

val sampleChatData = listOf(
    Chat(
        profileImg = R.drawable.img_opponent1_profile,
        userName = "권용빈",
        contentText = "ㅎㅇㅎㅇ",
        contentImg = null,
        contentType = Chat.ContentType.TEXT,
        sendAt = "오전 10:43",
        isOpponent = true
    ),
    Chat(
        profileImg = R.drawable.img_opponent2_profile,
        userName = "곽준환",
        contentText = "니들 뭐함?",
        contentImg = null,
        contentType = Chat.ContentType.TEXT,
        sendAt = "오전 10:43",
        isOpponent = true
    ),
    Chat(
        profileImg = R.drawable.img_opponent3_profile,
        userName = "김경훈",
        contentText = "롤하는 중ㅋㅋㅋ",
        contentImg = null,
        contentType = Chat.ContentType.TEXT,
        sendAt = "오전 10:44",
        isOpponent = true
    ),
    Chat(
        profileImg = R.drawable.img_my_profile,
        userName = "김주엽",
        contentText = "경훈이는 무슨 하루종일 롤만 하냐",
        contentImg = null,
        contentType = Chat.ContentType.TEXT,
        sendAt = "오전 10:44",
        isOpponent = false
    ),
    Chat(
        profileImg = R.drawable.img_opponent1_profile,
        userName = "권용빈",
        contentText = "웃긴 사진 보내줄까?",
        contentImg = null,
        contentType = Chat.ContentType.TEXT,
        sendAt = "오전 10:44",
        isOpponent = true
    ),
    Chat(
        profileImg = R.drawable.img_my_profile,
        userName = "김주엽",
        contentText = "?? 어떤 사진인데",
        contentImg = null,
        contentType = Chat.ContentType.TEXT,
        sendAt = "오전 10:45",
        isOpponent = false
    ),
    Chat(
        profileImg = R.drawable.img_opponent1_profile,
        userName = "권용빈",
        contentText = null,
        contentImg = R.drawable.img_opponent1_profile,
        contentType = Chat.ContentType.IMG,
        sendAt = "오전 10:45",
        isOpponent = true
    ),
    Chat(
        profileImg = R.drawable.img_opponent2_profile,
        userName = "곽준한",
        contentText = "ㅋㅋㅋㅋㅋㅋㅋㅋ",
        contentImg = null,
        contentType = Chat.ContentType.TEXT,
        sendAt = "오전 10:45",
        isOpponent = true
    ),
    Chat(
        profileImg = R.drawable.img_opponent3_profile,
        userName = "김경훈",
        contentText = "ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ 뭐하냐",
        contentImg = null,
        contentType = Chat.ContentType.TEXT,
        sendAt = "오전 10:46",
        isOpponent = true
    ),
    Chat(
        profileImg = R.drawable.img_my_profile,
        userName = "김주엽",
        contentText = "양치하는데 표정봐라ㅋㅋㅋㅋ",
        contentImg = null,
        contentType = Chat.ContentType.TEXT,
        sendAt = "오전 10:46",
        isOpponent = false
    ),
    Chat(
        profileImg = R.drawable.img_my_profile,
        userName = "김주엽",
        contentText = null,
        contentImg = R.drawable.img_opponent2_profile,
        contentType = Chat.ContentType.IMG,
        sendAt = "오전 10:46",
        isOpponent = false
    ),
    Chat(
        profileImg = R.drawable.img_my_profile,
        userName = "김주엽",
        contentText = "준환이 프사도 살벌하다",
        contentImg = null,
        contentType = Chat.ContentType.TEXT,
        sendAt = "오전 10:46",
        isOpponent = false
    ),
    Chat(
        profileImg = R.drawable.img_opponent2_profile,
        userName = "곽준환",
        contentText = "잘생기기만 했는데 무슨ㅋ",
        contentImg = null,
        contentType = Chat.ContentType.TEXT,
        sendAt = "오전 10:46",
        isOpponent = true
    ),
    Chat(
        profileImg = R.drawable.img_opponent3_profile,
        userName = "김경훈",
        contentText = "하 저거 또 시작이네",
        contentImg = null,
        contentType = Chat.ContentType.TEXT,
        sendAt = "오전 10:47",
        isOpponent = true
    )
)