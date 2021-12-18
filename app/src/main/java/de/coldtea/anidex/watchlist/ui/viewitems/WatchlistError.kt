package de.coldtea.anidex.watchlist.ui.viewitems

import androidx.compose.runtime.Composable
import de.coldtea.anidex.base.ui.viewitems.FullMessageScreen
import java.lang.reflect.Modifier

@Composable
fun WatchlistError(
    modifier: Modifier = Modifier()
){
    FullMessageScreen(message = "Something went wron please try again!")
}