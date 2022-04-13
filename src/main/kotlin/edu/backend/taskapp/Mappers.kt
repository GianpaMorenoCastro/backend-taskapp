package edu.backend.taskapp

import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface PriorityMapper {
    fun priorityToPriorityDetails(
        priority: Priority
    ) : PriorityDetails

    fun priorityListToPriorityDetailsList(
        priorityList: List<Priority>
    ) : List<PriorityDetails>
}

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface TaskMapper {
    fun taskToTaskResult(
        task: Task
    ) : TaskResult

    fun taskListToTaskListResult (
        taskList: List<Task>
    ) : List<TaskResult>

    fun taskInputToTask (
        taskInput: TaskInput
    ) : Task
}