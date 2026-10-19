package Ua;

import Ya.k;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;
import kotlin.text.n;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.format.C2722g;
import kotlinx.datetime.format.DateTimeComponents;

/* JADX INFO: compiled from: Instant.kt */
/* JADX INFO: loaded from: classes2.dex */
@k(with = Xa.b.class)
public final class d implements Comparable<d> {
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f6575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f6576d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f6577b;

    /* JADX INFO: compiled from: Instant.kt */
    public static final class a {
        public static d a(a aVar, String input) {
            C2722g format = DateTimeComponents.Formats.f43645a;
            aVar.getClass();
            kotlin.jvm.internal.i.e(input, "input");
            kotlin.jvm.internal.i.e(format, "format");
            try {
                int iP = n.P(input, 'T', 0, true, 2);
                if (iP != -1) {
                    int length = input.length() - 1;
                    if (length < 0) {
                        length = -1;
                        break;
                    }
                    while (true) {
                        int i10 = length - 1;
                        char cCharAt = input.charAt(length);
                        if (cCharAt == '+' || cCharAt == '-') {
                            break;
                        }
                        if (i10 < 0) {
                            length = -1;
                            break;
                        }
                        length = i10;
                    }
                    if (length >= iP && n.P(input, ':', length, false, 4) == -1) {
                        input = ((Object) input) + ":00";
                    }
                }
                Instant instant = OffsetDateTime.parse(input).toInstant();
                kotlin.jvm.internal.i.d(instant, "toInstant(...)");
                return new d(instant);
            } catch (DateTimeParseException e10) {
                throw new DateTimeFormatException(e10);
            }
        }

        public final Ya.b<d> serializer() {
            return Xa.b.f7436a;
        }
    }

    static {
        Instant instantOfEpochSecond = Instant.ofEpochSecond(-3217862419201L, 999999999L);
        kotlin.jvm.internal.i.d(instantOfEpochSecond, "ofEpochSecond(...)");
        new d(instantOfEpochSecond);
        Instant instantOfEpochSecond2 = Instant.ofEpochSecond(3093527980800L, 0L);
        kotlin.jvm.internal.i.d(instantOfEpochSecond2, "ofEpochSecond(...)");
        new d(instantOfEpochSecond2);
        Instant MIN = Instant.MIN;
        kotlin.jvm.internal.i.d(MIN, "MIN");
        f6575c = new d(MIN);
        Instant MAX = Instant.MAX;
        kotlin.jvm.internal.i.d(MAX, "MAX");
        f6576d = new d(MAX);
    }

    public d(Instant value) {
        kotlin.jvm.internal.i.e(value, "value");
        this.f6577b = value;
    }

    @Override // java.lang.Comparable
    public final int compareTo(d dVar) {
        d other = dVar;
        kotlin.jvm.internal.i.e(other, "other");
        return this.f6577b.compareTo(other.f6577b);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (kotlin.jvm.internal.i.a(this.f6577b, ((d) obj).f6577b)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6577b.hashCode();
    }

    public final String toString() {
        String string = this.f6577b.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        return string;
    }
}
