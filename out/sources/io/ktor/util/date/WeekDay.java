package io.ktor.util.date;

/* JADX INFO: compiled from: Date.kt */
/* JADX INFO: loaded from: classes.dex */
public enum WeekDay {
    /* JADX INFO: Fake field, exist only in values array */
    MONDAY("Mon"),
    /* JADX INFO: Fake field, exist only in values array */
    TUESDAY("Tue"),
    /* JADX INFO: Fake field, exist only in values array */
    WEDNESDAY("Wed"),
    /* JADX INFO: Fake field, exist only in values array */
    THURSDAY("Thu"),
    /* JADX INFO: Fake field, exist only in values array */
    FRIDAY("Fri"),
    /* JADX INFO: Fake field, exist only in values array */
    SATURDAY("Sat"),
    /* JADX INFO: Fake field, exist only in values array */
    SUNDAY("Sun");

    private final String value;

    WeekDay(String str) {
        this.value = str;
    }
}
