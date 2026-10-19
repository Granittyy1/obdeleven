package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public enum ToNumberPolicy implements l {
    f28816b { // from class: com.google.gson.ToNumberPolicy.1
        @Override // com.google.gson.l
        public final Number a(M7.a aVar) throws IOException {
            return Double.valueOf(aVar.S());
        }
    },
    f28817c { // from class: com.google.gson.ToNumberPolicy.2
        @Override // com.google.gson.l
        public final Number a(M7.a aVar) throws IOException {
            return new LazilyParsedNumber(aVar.r0());
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF16 { // from class: com.google.gson.ToNumberPolicy.3
        public static Double b(String str, M7.a aVar) throws IOException {
            try {
                Double dValueOf = Double.valueOf(str);
                if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                    if (!(aVar.f4589c == Strictness.f28812b)) {
                        throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + aVar.B());
                    }
                }
                return dValueOf;
            } catch (NumberFormatException e10) {
                StringBuilder sbA = C7.g.a("Cannot parse ", str, "; at path ");
                sbA.append(aVar.B());
                throw new JsonParseException(sbA.toString(), e10);
            }
        }

        @Override // com.google.gson.l
        public final Number a(M7.a aVar) throws JsonParseException, IOException {
            String strR0 = aVar.r0();
            if (strR0.indexOf(46) >= 0) {
                return b(strR0, aVar);
            }
            try {
                return Long.valueOf(Long.parseLong(strR0));
            } catch (NumberFormatException unused) {
                return b(strR0, aVar);
            }
        }
    },
    /* JADX INFO: Fake field, exist only in values array */
    EF21 { // from class: com.google.gson.ToNumberPolicy.4
        @Override // com.google.gson.l
        public final Number a(M7.a aVar) throws IOException {
            String strR0 = aVar.r0();
            try {
                return com.google.gson.internal.e.b(strR0);
            } catch (NumberFormatException e10) {
                StringBuilder sbA = C7.g.a("Cannot parse ", strR0, "; at path ");
                sbA.append(aVar.B());
                throw new JsonParseException(sbA.toString(), e10);
            }
        }
    };

    ToNumberPolicy() {
        throw null;
    }
}
