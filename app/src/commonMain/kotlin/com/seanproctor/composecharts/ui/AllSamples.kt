package com.seanproctor.composecharts.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.seanproctor.composecharts.LineChart
import com.seanproctor.composecharts.models.AnimationMode
import com.seanproctor.composecharts.models.DotProperties
import com.seanproctor.composecharts.models.LabelProperties
import com.seanproctor.composecharts.models.Line
import com.seanproctor.composecharts.models.PopupProperties

@Composable
fun TabletSample() {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(250.dp),
        verticalArrangement = Arrangement.spacedBy(28.dp),
        horizontalArrangement = Arrangement.spacedBy(28.dp),
        contentPadding = PaddingValues(28.dp)
    ) {
        item {
            ChartParent(Modifier) {
                LineChart(
                    data = remember {
                        listOf(
                            Line(
                                label = "Test",
                                values = listOf(5.0),
                                color = SolidColor(Color.Red),
                            ),
                            Line(
                                label = "Test 2",
                                values = listOf(2.0),
                                color = SolidColor(Color.Red),
                                dotProperties = DotProperties(
                                    confirmDraw = {
                                        false
                                    }
                                )
                            ),
                        )
                    },
                    dotsProperties = DotProperties(
                        enabled = true,
                        color = SolidColor(Color.White)
                    ),
                    modifier = Modifier.padding(22.dp),
                    animationMode = AnimationMode.None,
                    minValue = 0.0,
                    maxValue = 7.0,
                    labelProperties = labelProperties,
                    labelHelperProperties = labelHelperProperties,
                    indicatorProperties = indicatorProperties,
                    popupProperties =
                        PopupProperties(
                            textStyle = TextStyle.Default.copy(
                                color = Color.White,
                                fontSize = 12.sp
                            ),
                            confirmDraw = {
                                false
                            }
                        ),
                    )
            }
        }
        // Pie
        item {
            PieSample()
        }
        item {
            PieSample2()
        }
        item {
            PieSample3()
        }

        // Column
        item {
            ColumnSample()
        }
        item {
            ColumnSample2()
        }
        item {
            ColumnSample3()
        }

        //Row
        item {
            RowSample()
        }
        item {
            RowSample2()
        }
        item {
            RowSample3()
        }

        // Line
        item {
            LineSample()
        }
        item {
            LineSample2()
        }
        item {
            LineSample4()
        }
        item {
            LineSample8()
        }
        item {
            LineSample7()
        }
        item {
            LineSample6()
        }
        item {
            LineSample5()
        }
        item {
            LineSample3()
        }
        item {
            LineSample9()
        }

    }
}





