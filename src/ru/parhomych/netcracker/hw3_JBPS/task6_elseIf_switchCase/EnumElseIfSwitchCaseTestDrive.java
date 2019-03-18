package ru.parhomych.netcracker.hw3_JBPS.task6_elseIf_switchCase;

public class EnumElseIfSwitchCaseTestDrive {
    public static void main(String[] args) {
        WorkingDays dayOfWeek = WorkingDays.FRIDAY;

        long startTime = System.nanoTime();
        if (dayOfWeek == WorkingDays.MONDAY){
            System.out.println("Понедельник!");
        }else if (dayOfWeek == WorkingDays.TUESDAY){
            System.out.println("Вторник!");
        }else if (dayOfWeek == WorkingDays.WEDNESDAY){
            System.out.println("Среда!");
        }else if (dayOfWeek == WorkingDays.THURSDAY){
            System.out.println("Четверг!");
        }else if (dayOfWeek == WorkingDays.FRIDAY){
            System.out.println("Friday I'm in love");
        }
        long endTime = System.nanoTime();
        long elseIfTime = endTime - startTime;

        startTime = System.nanoTime();
        switch (dayOfWeek){
            case MONDAY:
                System.out.println("Понедельник!");
                break;
            case TUESDAY:
                System.out.println("Вторник!");
                break;
            case WEDNESDAY:
                System.out.println("Среда!");
                break;
            case THURSDAY:
                System.out.println("Четверг!");
                break;
            case FRIDAY:
                System.out.println("Friday I'm in love");
        }
        endTime = System.nanoTime();
        long switchTime = endTime - startTime;

        System.out.println("Else If Time for Enum --> " + elseIfTime);
        System.out.println("Switch Time for Enum --> " + switchTime);

        if (elseIfTime < switchTime){
            System.out.println("Else is much faster than Switch-case");
        } else if (elseIfTime > switchTime) {
            System.out.println("Switch-case is much faster than Else If");
        } else {
            System.out.println("Times for Else If & Switch-case are the same");
        }
    }
}
