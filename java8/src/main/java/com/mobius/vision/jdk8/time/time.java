package com.mobius.vision.jdk8.time;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author NingXioaoming
 * @createTime 2019/12/6 14:01
 * @description
 */
public class time {

    public static void main(String[] args) {

        final LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getYear() + "," + now.getMonthValue() + "," + now.getDayOfMonth() + "," + now.getDayOfYear() + "," + now.getDayOfWeek().getValue() + ",");
        System.out.println("-------------------");
        final LocalDate of = LocalDate.of(2010, 10, 10);
        System.out.println(of);

        final MonthDay of1 = MonthDay.of(of.getMonthValue(), of.getDayOfMonth());
        final MonthDay from = MonthDay.from(LocalDate.of(2011, 10, 10));
        if (of1.equals(from)) {
            System.out.println("你好");
        }

        final LocalTime now1 = LocalTime.now();
        final LocalTime localTime = now1.plusHours(3).plusMinutes(2);
        System.out.println(now1);
        System.out.println(localTime);

        final LocalDate plus = now.plus(1, ChronoUnit.WEEKS);
        System.out.println(plus);
        final LocalDate minus = now.minus(1, ChronoUnit.WEEKS);
        System.out.println(minus);

        final Set<String> set = ZoneId.getAvailableZoneIds();
        TreeSet treeSet = new TreeSet<String>() {
            {
                addAll(set);
            }
        };
        treeSet.forEach(System.out::println);

        final LocalDate localDate = LocalDate.now();
        final LocalDate localDate1 = LocalDate.of(2017, 11, 6);
        final Period period = Period.between(localDate1, localDate);

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        System.out.println(Instant.now());


    }
}
