package kr.groo.android.kakaotalk.presentation.screen

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import kr.groo.android.kakaotalk.presentation.ui.KakaoTalkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // FIXME: Deprecated 구문 수정
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
        setContent {
            MyApp {
                ChatScreen()
            }
        }
    }
}

@Composable
private fun MyApp(content: @Composable () -> Unit) {
    KakaoTalkTheme {
        content()
    }
}

@Preview
@Composable
private fun PreviewMyApp() {
    MyApp {
        ChatScreen()
    }
}