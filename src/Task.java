public class Task {
    String taskName;
    int taskPriority;
    boolean isComplete;

    public Task(String taskName, int taskPriority, boolean isComplete){
        this.taskName = taskName;
        this.taskPriority = taskPriority;
        this.isComplete = isComplete;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(int taskPriority) {
        this.taskPriority = taskPriority;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    @Override
    public String toString() {
        return taskName +
                ", Task Priority = " + taskPriority +
                ", isComplete=" + isComplete;
    }
}
