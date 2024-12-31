package bo.jiska.lurawi.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import bo.jiska.lurawi.MainScreen
import bo.jiska.lurawi.SplashScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AppScreens.SplashScreen
            .router) {
        composable(AppScreens.SplashScreen.router){
            SplashScreen(navController)
        }
        composable(AppScreens.SplashScreen.router){
            MainScreen()
        }

    }
}