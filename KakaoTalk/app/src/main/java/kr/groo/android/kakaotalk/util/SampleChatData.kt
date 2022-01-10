package kr.groo.android.kakaotalk.util

import kr.groo.android.kakaotalk.R
import kr.groo.android.kakaotalk.model.Chat

val sampleChatData = listOf(
    Chat(
        profileImg = R.drawable.img_opponent1_profile,
        userName = "권용빈",
        contentText = "안녕 얘들아",
        contentImg = R.drawable.img_opponent1_profile,
        contentType = Chat.ContentType.TEXT,
        sendAt = "오전 10:43",
        isOpponent = true
    ),
    Chat(
        profileImg = R.drawable.img_opponent2_profile,
        userName = "김경원",
        contentText = "잘 지냈어?",
        contentImg = null,
        contentType = Chat.ContentType.TEXT,
        sendAt = "오전 10:45",
        isOpponent = true
    ),
    Chat(
        profileImg = R.drawable.img_opponent3_profile,
        userName = "박진",
        contentText = "진짜 오랜만이다",
        contentImg = null,
        contentType = Chat.ContentType.TEXT,
        sendAt = "오전 10:46",
        isOpponent = true
    ),
    Chat(
        profileImg = R.drawable.img_my_profile,
        userName = "김주엽",
        contentText = "그러게 너무 반가워",
        contentImg = null,
        contentType = Chat.ContentType.TEXT,
        sendAt = "오전 10:46",
        isOpponent = false
    )
)