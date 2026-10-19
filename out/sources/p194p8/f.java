package p194p8;

import com.obdeleven.service.enums.ValueUnit;
import com.obdeleven.service.model.measurement.MeasurementException;
import com.obdeleven.service.util.b;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.core.app.I;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import p134k8.T1;

/* JADX INFO: compiled from: KWP2000Measurement.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends h {
    @Override // p194p8.h
    public final Task<List<T1>> g(ValueUnit valueUnit) {
        return this.f45910a.D(false).continueWithTask(new I(this, 2, valueUnit));
    }

    @Override // p194p8.h
    public final Task<List<T1>> h(final String str, final ValueUnit valueUnit) {
        return Task.callInBackground(new Callable() { // from class: p8.d
            @Override // java.util.concurrent.Callable
            public final Object call() throws MeasurementException {
                f fVar = this.f45901b;
                fVar.getClass();
                String str2 = str;
                if (!str2.startsWith("61")) {
                    throw new MeasurementException(2);
                }
                a aVarJ = fVar.j(str2.substring(4));
                if (aVarJ != null) {
                    fVar.f(aVarJ.f45888a, 3, aVarJ.f45889b);
                }
                return fVar.a(valueUnit);
            }
        });
    }

    public final a j(String str) {
        byte[] bArrE = b.e(str);
        a aVar = new a();
        aVar.f45888a = null;
        aVar.f45889b = 0;
        int length = 12;
        if (this.f45911b < 128) {
            byte b10 = bArrE[0];
            if (b10 == 95 || b10 == 118) {
                aVar.f45888a = Arrays.copyOfRange(bArrE, 0, (bArrE[1] & 255) + 2);
                aVar.f45889b = 1;
            } else if (b10 == 110) {
                aVar.f45888a = Arrays.copyOfRange(bArrE, 0, 7);
                aVar.f45889b = 1;
            } else if (b10 != 111) {
                length = bArrE.length < 13 ? bArrE.length : 12;
                aVar.f45888a = Arrays.copyOfRange(bArrE, 0, length);
                int i10 = length / 3;
                aVar.f45889b = i10;
                if (i10 == 0) {
                    return null;
                }
            } else {
                aVar.f45888a = Arrays.copyOfRange(bArrE, 0, 4);
                aVar.f45889b = 1;
            }
        } else {
            byte b11 = bArrE[0];
            if (b11 == 95 || b11 == 118) {
                length = (bArrE[1] & 255) + 2;
            } else if (b11 == 110) {
                length = 7;
            } else if (b11 == 111) {
                length = 4;
            }
            if (bArrE.length <= length) {
                return null;
            }
            byte b12 = bArrE[length];
            if (b12 == 95 || b12 == 118) {
                aVar.f45888a = Arrays.copyOfRange(bArrE, length, bArrE[length + 1] + 2 + length);
                aVar.f45889b = 1;
            } else if (b12 == 110) {
                aVar.f45888a = Arrays.copyOfRange(bArrE, length, length + 7);
                aVar.f45889b = 1;
            } else if (b12 == 111) {
                aVar.f45888a = Arrays.copyOfRange(bArrE, length, length + 4);
                aVar.f45889b = 1;
            } else {
                int length2 = bArrE.length - length;
                aVar.f45888a = Arrays.copyOfRange(bArrE, length, length2 + length);
                int i11 = length2 / 3;
                aVar.f45889b = i11;
                if (i11 == 0) {
                    return null;
                }
            }
        }
        return aVar;
    }
}
