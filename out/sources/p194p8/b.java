package p194p8;

import com.obdeleven.service.enums.ValueUnit;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.measurement.MeasurementException;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p134k8.T1;

/* JADX INFO: compiled from: KWP1281Measurement.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f45891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f45893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f45894i;

    /* JADX INFO: compiled from: KWP1281Measurement.java */
    public class a implements Continuation<Boolean, Task<List<T1>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ValueUnit f45895a;

        public a(ValueUnit valueUnit) {
            this.f45895a = valueUnit;
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Task<List<T1>> then(Task<Boolean> task) throws Exception {
            if (!task.getResult().booleanValue()) {
                throw new MeasurementException(1);
            }
            b bVar = b.this;
            int i10 = bVar.f45911b;
            ValueUnit valueUnit = this.f45895a;
            return i10 == 0 ? bVar.f45910a.f29335r.d("12").continueWith(new c(bVar, valueUnit)) : bVar.j(valueUnit);
        }
    }

    /* JADX INFO: renamed from: p8.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: KWP1281Measurement.java */
    public class C0519b implements Continuation<String, Task<List<T1>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ValueUnit f45897a;

        public C0519b(ValueUnit valueUnit) {
            this.f45897a = valueUnit;
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Task<List<T1>> then(Task<String> task) throws Exception {
            String result = task.getResult();
            byte[] bArrE = com.obdeleven.service.util.b.e(result);
            b bVar = b.this;
            bVar.f45910a.f29320b.saveKWP1281Measurement(bVar.f45911b, result);
            int i10 = 0;
            int i11 = bArrE[0] & 255;
            ArrayList arrayList = bVar.f45894i;
            ArrayList arrayList2 = bVar.f45893h;
            int i12 = 1;
            ValueUnit valueUnit = this.f45897a;
            if (i11 == 2) {
                bVar.f45892g = true;
                arrayList2.clear();
                arrayList.clear();
                int length = bArrE.length;
                while (i12 < length) {
                    k kVar = new k();
                    kVar.f45916a = bArrE[i12];
                    int i13 = i12 + 2;
                    kVar.f45917b = bArrE[i12 + 1];
                    int i14 = i12 + 3;
                    byte b10 = bArrE[i13];
                    arrayList.add(b10 == 0 ? new byte[0] : Arrays.copyOfRange(bArrE, i14, i14 + b10));
                    i12 = i14 + b10;
                    arrayList2.add(kVar);
                }
                return bVar.j(valueUnit);
            }
            if (i11 == 231) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrE, 1, bArrE.length);
                bVar.f45891f = bArrCopyOfRange;
                bVar.f45890e = bArrCopyOfRange.length / 3;
            } else {
                if (i11 != 244) {
                    throw new MeasurementException(2);
                }
                if (!bVar.f45892g) {
                    bVar.d(Arrays.copyOfRange(bArrE, 1, bArrE.length));
                    return Task.forResult(bVar.a(valueUnit));
                }
                int length2 = bArrE.length;
                bVar.f45890e = 0;
                bVar.f45891f = new byte[(length2 - 1) * 3];
                int i15 = 1;
                while (i15 < length2) {
                    k kVar2 = (k) arrayList2.get(bVar.f45890e);
                    byte[] bArr = bVar.f45891f;
                    bArr[i10] = kVar2.f45916a;
                    int i16 = i10 + 2;
                    bArr[i10 + 1] = kVar2.f45917b;
                    i10 += 3;
                    bArr[i16] = bArrE[i15];
                    i15++;
                    bVar.f45890e++;
                }
            }
            if (bVar.f45892g) {
                bVar.e(bVar.f45890e, bVar.f45891f, arrayList);
            } else {
                bVar.f(bVar.f45891f, 1, bVar.f45890e);
            }
            return Task.forResult(bVar.a(valueUnit));
        }
    }

    public b(int i10, ControlUnit controlUnit) {
        super(i10, controlUnit);
        this.f45893h = new ArrayList();
        this.f45894i = new ArrayList();
    }

    @Override // p194p8.h
    public final Task<List<T1>> g(ValueUnit valueUnit) {
        return this.f45910a.D(false).continueWithTask(new a(valueUnit));
    }

    @Override // p194p8.h
    public final Task<List<T1>> h(String str, ValueUnit valueUnit) {
        int i10 = this.f45911b;
        if (i10 == 0) {
            if (!str.startsWith("F4")) {
                return Task.forResult(null);
            }
            d(com.obdeleven.service.util.b.e(str.substring(2)));
            return Task.forResult(a(valueUnit));
        }
        byte[] bArrE = com.obdeleven.service.util.b.e(str);
        this.f45910a.f29320b.saveKWP1281Measurement(i10, str);
        int i11 = 0;
        int i12 = bArrE[0] & 255;
        ArrayList arrayList = this.f45894i;
        ArrayList arrayList2 = this.f45893h;
        int i13 = 1;
        if (i12 == 2) {
            this.f45892g = true;
            arrayList2.clear();
            arrayList.clear();
            int length = bArrE.length;
            while (i13 < length) {
                k kVar = new k();
                kVar.f45916a = bArrE[i13];
                int i14 = i13 + 2;
                kVar.f45917b = bArrE[i13 + 1];
                int i15 = i13 + 3;
                byte b10 = bArrE[i14];
                arrayList.add(b10 == 0 ? new byte[0] : Arrays.copyOfRange(bArrE, i15, i15 + b10));
                i13 = i15 + b10;
                arrayList2.add(kVar);
            }
            return j(valueUnit);
        }
        if (i12 == 231) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrE, 1, bArrE.length);
            this.f45891f = bArrCopyOfRange;
            this.f45890e = bArrCopyOfRange.length / 3;
        } else {
            if (i12 != 244) {
                return Task.forResult(null);
            }
            if (!this.f45892g) {
                d(Arrays.copyOfRange(bArrE, 1, bArrE.length));
                return Task.forResult(a(valueUnit));
            }
            int length2 = bArrE.length;
            this.f45890e = 0;
            this.f45891f = new byte[(length2 - 1) * 3];
            int i16 = 1;
            while (i16 < length2) {
                k kVar2 = (k) arrayList2.get(this.f45890e);
                byte[] bArr = this.f45891f;
                bArr[i11] = kVar2.f45916a;
                int i17 = i11 + 2;
                bArr[i11 + 1] = kVar2.f45917b;
                i11 += 3;
                bArr[i17] = bArrE[i16];
                i16++;
                this.f45890e++;
            }
        }
        if (this.f45892g) {
            e(this.f45890e, this.f45891f, arrayList);
        } else {
            f(this.f45891f, 1, this.f45890e);
        }
        return Task.forResult(a(valueUnit));
    }

    public final Task<List<T1>> j(ValueUnit valueUnit) {
        return this.f45910a.f29335r.d(String.format("29%02X", Integer.valueOf(this.f45911b))).continueWithTask(new C0519b(valueUnit));
    }
}
