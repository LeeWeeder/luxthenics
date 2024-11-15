package com.leeweeder.yluxthenics.api_program.util

import com.leeweeder.yluxthenics.api_program.asset.Cycle
import com.leeweeder.yluxthenics.api_program.asset.Period
import com.leeweeder.yluxthenics.api_program.asset.WeekNumber
import com.leeweeder.yluxthenics.api_program.asset.Workout

data class WorkoutWrapper(
    val cycle: Cycle,
    val cycleOrder: Int,
    val weekNumber: WeekNumber,
    val workout: Workout,
    val workoutOrder: Int,
    val name: String,
    val period: Period
)