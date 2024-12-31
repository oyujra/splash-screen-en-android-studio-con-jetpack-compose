package bo.jiska.lurawi.navigation

sealed class AppScreens(val router: String) {
    object SplashScreen: AppScreens("splash_screen")
    object MainScreen: AppScreens("main_screen")
}