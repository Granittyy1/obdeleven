package kotlinx.datetime.format;

import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.internal.format.parser.ParseException;
import kotlinx.datetime.internal.format.parser.c;

/* JADX INFO: renamed from: kotlinx.datetime.format.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DateTimeFormat.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2716a<T, U extends kotlinx.datetime.internal.format.parser.c<U>> implements InterfaceC2723h<T> {
    @Override // kotlinx.datetime.format.InterfaceC2723h
    public final Object a(String input) {
        kotlin.jvm.internal.i.e(input, "input");
        try {
            kotlinx.datetime.internal.format.parser.l<U> commands = b().b();
            kotlin.jvm.internal.i.e(commands, "commands");
            try {
                return d(kotlinx.datetime.internal.format.parser.i.a(commands, input, c()));
            } catch (IllegalArgumentException e10) {
                String message = e10.getMessage();
                kotlin.jvm.internal.i.b(message);
                throw new DateTimeFormatException(message);
            }
        } catch (ParseException e11) {
            String message2 = "Failed to parse value from '" + ((Object) input) + '\'';
            kotlin.jvm.internal.i.e(message2, "message");
            throw new DateTimeFormatException(message2, e11);
        }
    }

    public abstract kotlinx.datetime.internal.format.f<U> b();

    public abstract U c();

    public abstract T d(U u10);
}
