package com.example.a7minutesworkout

object Constants {

    fun defaultExerciseList() : ArrayList<ExerciseModel>{
        val exerciseModel = ArrayList<ExerciseModel>()

        val jumpingJacks = ExerciseModel(1,"Jumping Jacks",R.drawable.jumping_jacks,false,false)

        val burpees = ExerciseModel(2,"Burpees",R.drawable.burpees,false,false)

        val plank = ExerciseModel(3,"Plank",R.drawable.plank,false,false)

        val pullUps = ExerciseModel(4,"Pull Ups",R.drawable.pull_ups,false,false)

        val pushUps = ExerciseModel(5,"Push Ups",R.drawable.push_ups,false,false)

        val squats = ExerciseModel(6,"Squats",R.drawable.squats,false,false)

        val lunges = ExerciseModel(7,"Lunges",R.drawable.lunges,false,false)

        val sidePlank = ExerciseModel(8,"Side Plank",R.drawable.side_plank,false,false)

        val pushUpsAndRotation = ExerciseModel(9,"Push Ups And Rotation",R.drawable.pushups_and_rotaion,false,false)

        val highSpeedRunningInPlace = ExerciseModel(10,"High Speed Running in Place",R.drawable.high_speed_running_in_place,false,false)

        exerciseModel.add(jumpingJacks)
        exerciseModel.add(burpees)
        exerciseModel.add(plank)
        exerciseModel.add(pullUps)
        exerciseModel.add(pushUps)
        exerciseModel.add(squats)
        exerciseModel.add(lunges)
        exerciseModel.add(sidePlank)
        exerciseModel.add(pushUpsAndRotation)
        exerciseModel.add(highSpeedRunningInPlace)

        return exerciseModel
    }
}