package kotlinx.datetime;

import Ua.i;
import Ua.j;
import java.time.DateTimeException;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import kotlin.a;
import p293xa.g;

/* JADX INFO: compiled from: UtcOffsetJvm.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class UtcOffsetJvmKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f43622a = a.a(new Ia.a<DateTimeFormatter>() { // from class: kotlinx.datetime.UtcOffsetJvmKt$isoFormat$2
        @Override // Ia.a
        public final DateTimeFormatter invoke() {
            return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffsetId().toFormatter();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f43623b = a.a(new Ia.a<DateTimeFormatter>() { // from class: kotlinx.datetime.UtcOffsetJvmKt$isoBasicFormat$2
        @Override // Ia.a
        public final DateTimeFormatter invoke() {
            return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHmmss", "Z").toFormatter();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f43624c = a.a(new Ia.a<DateTimeFormatter>() { // from class: kotlinx.datetime.UtcOffsetJvmKt$fourDigitsFormat$2
        @Override // Ia.a
        public final DateTimeFormatter invoke() {
            return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHMM", "+0000").toFormatter();
        }
    });

    public static final i a(String str, DateTimeFormatter dateTimeFormatter) {
        try {
            return new i((ZoneOffset) dateTimeFormatter.parse(str, new j()));
        } catch (DateTimeException e10) {
            throw new DateTimeFormatException(e10);
        }
    }
}
