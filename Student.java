class Student {
    String index;
    String firstName;
    String lastName;
    List <Integer> grades;

    //TODO constructor
    public Student(String index, String firstName, String lastName, List<Integer> grades) {
        this.index = index;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }

    //TODO seters & getters
    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }


    public double getAverage(List<Integer> grades) {
        //TODO
        double sum=0;
        if(grades.isEmpty){
            return 0;
        }
        else {
            for (Integer grade : grades) {
                sum += grade;
            }
            return sum / grades.size();
        }
    }

    public int ECTSCredits(List<Integer> grades) {
        //TODO
        int ects;
        for(Integer grade: grades){
            if(grade>=6)
                ects+=6;
        }
        return ects;
    }
}