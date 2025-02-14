package com.example.studyfocus.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.studyfocus.ui.components.report.ReportCard
import com.example.studyfocus.ui.viewmodels.ReportViewModel

@Composable
fun ReportScreen(reportViewModel: ReportViewModel = hiltViewModel()) {
    val completedTaskCount = reportViewModel.completedTaskCount.observeAsState(0)
    val incompleteTaskCount = reportViewModel.incompleteTaskCount.observeAsState(0)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ReportCard("Completed Tasks", completedTaskCount.value)
        Spacer(modifier = Modifier.height(16.dp))
        ReportCard("Incomplete Tasks", incompleteTaskCount.value)
    }
}