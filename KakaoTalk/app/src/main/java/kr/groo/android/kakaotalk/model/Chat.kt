package kr.groo.android.kakaotalk.model

data class Chat(
    val profileImg: Int,
    val userName: String,
    val contentText: String?,
    val contentImg: Int?,
    val contentType: ContentType,
    val sendAt: String,
    val isOpponent: Boolean
) {
    enum class ContentType {
        TEXT,
        IMG
    }
}
