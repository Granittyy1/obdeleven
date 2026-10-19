package A8;

import com.voltasit.obdeleven.domain.models.oca.CommandType;

/* JADX INFO: compiled from: OcaCommandMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class k {
    public static I8.b a(p304y9.s input) {
        CommandType commandType;
        kotlin.jvm.internal.i.e(input, "input");
        CommandType.f30560b.getClass();
        String value = input.f48619a;
        kotlin.jvm.internal.i.e(value, "value");
        CommandType[] commandTypeArrValues = CommandType.values();
        int length = commandTypeArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                commandType = null;
                break;
            }
            commandType = commandTypeArrValues[i10];
            if (kotlin.jvm.internal.i.a(commandType.a(), value)) {
                break;
            }
            i10++;
        }
        if (commandType == null) {
            commandType = CommandType.Unknown;
        }
        return new I8.b(commandType, input.f48620b, input.f48621c, input.f48622d);
    }
}
