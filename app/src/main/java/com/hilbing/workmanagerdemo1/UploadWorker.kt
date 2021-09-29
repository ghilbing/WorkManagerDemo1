package com.hilbing.workmanagerdemo1

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters
import java.lang.Exception

class UploadWorker(context: Context, workerParams: WorkerParameters) : Worker(context, workerParams) {
    override fun doWork(): Result {
        try {
            for(i: Int  in 0..600){
                Log.i("MyTAG", "Uploading $i")
            }
            return Result.success()
        } catch (e: Exception){
            return Result.failure()
        }
    }
}