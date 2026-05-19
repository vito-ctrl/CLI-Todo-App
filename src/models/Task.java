public class Task {
    public static void main(String[] args) {
        private String title;
        private boolean isComplete;
        private LocalDate createdAt;

        public Task(String t){
            this.title = t;
            this.isComplete = false;
        }

        public String getTitle() {
            return title;
        }

        public boolean getIsComplete () {
            return isComplete;
        }

        public void setIsComplete (boolean c) {
            this.isComplete = c;
        }
    }
}