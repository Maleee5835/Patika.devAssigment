class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    int how_Many_Tax;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.how_Many_Tax = how_Many_Tax;
    }

    double tax() {
        if (this.salary > 100) {
            return this.salary - this.salary * 0.97;
        } else {
            return 0;
        }
    }

    double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;

        }
    }

    double raiseSalary() {
        if ((this.hireYear - 2021) < 10) {
            return (this.salary * 1.05 - this.salary);
        } else if ((this.hireYear - 2021) > 9 && ((this.hireYear - 2021) < 20)) {
            return (this.salary * 1.1 - this.salary);
        } else if ((this.hireYear - 2021) > 19) {
            return (this.salary * 1.15 - this.salary);
        }
        return 0;
    }

    void to_String() {
        System.out.println("İsim:" + this.name);
        System.out.println("Maaş:" + this.salary);
        System.out.println("Çalışma saati:" + this.workHours);
        System.out.println("Başlangıç yılı:" + this.hireYear);
        System.out.println("Vergi:" + tax());
        System.out.println("Bonus:" + bonus());
        System.out.println("Maaş artışı:" + raiseSalary());
        System.out.println("Toplam maaş:" + (this.salary + bonus() + raiseSalary() - tax()));

    }


}
