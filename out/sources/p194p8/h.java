package p194p8;

import S3.b;
import com.google.android.gms.internal.measurement.C1787c0;
import com.obdeleven.service.enums.ValueUnit;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.core.app.z0;
import com.voltasit.parse.model.ControlUnitLabelDB;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p121j8.c;
import p134k8.T1;

/* JADX INFO: compiled from: KWPMeasurement.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControlUnit f45910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f45912c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f45913d;

    public h(int i10, ControlUnit controlUnit) {
        this.f45910a = controlUnit;
        this.f45911b = i10;
    }

    @Override // p194p8.j
    public final ArrayList a(ValueUnit valueUnit) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f45912c);
        return valueUnit == ValueUnit.f29311c ? C1787c0.l(arrayList) : arrayList;
    }

    @Override // p194p8.j
    public final Task<List<T1>> b(ValueUnit valueUnit) {
        if (this.f45913d != null) {
            return g(valueUnit);
        }
        ControlUnitLabelDB.Type type = ControlUnitLabelDB.Type.f34409b;
        return c.a(this.f45911b, this.f45910a, type).continueWithTask(new z0(this, 3, valueUnit));
    }

    @Override // p194p8.j
    public final void c(c cVar) {
        this.f45913d = cVar;
        i();
    }

    public final void d(byte[] bArr) {
        ArrayList arrayList = this.f45912c;
        arrayList.clear();
        for (byte b10 : bArr) {
            arrayList.add(new T1(null, Integer.toString(b10 & 255), null));
        }
        i();
    }

    public final void e(int i10, byte[] bArr, ArrayList arrayList) {
        b bVar;
        int length;
        byte[] bArrCopyOfRange;
        ArrayList arrayList2 = this.f45912c;
        arrayList2.clear();
        ArrayList arrayList3 = new ArrayList();
        if (bArr == null || i10 == 0) {
            bVar = new b(arrayList3);
        } else {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = i12 + 2;
                if (i13 >= bArr.length) {
                    break;
                }
                int i14 = bArr[i12] & 255;
                if (i14 == 63) {
                    byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i12, bArr.length);
                    length = i12 + bArr.length;
                    bArrCopyOfRange = bArrCopyOfRange2;
                } else if (i14 == 95) {
                    length = i13 + (bArr[i12 + 1] & 255);
                    bArrCopyOfRange = Arrays.copyOfRange(bArr, i12, length);
                } else if (i14 == 108) {
                    length = i12 + 15;
                    bArrCopyOfRange = Arrays.copyOfRange(bArr, i12, length);
                } else if (i14 == 118) {
                    length = i13 + (bArr[i12 + 1] & 255);
                    bArrCopyOfRange = Arrays.copyOfRange(bArr, i12, length);
                } else if (i14 == 160) {
                    length = i12 + 6;
                    bArrCopyOfRange = Arrays.copyOfRange(bArr, i12, length);
                } else if (i14 == 110) {
                    length = i12 + 7;
                    bArrCopyOfRange = Arrays.copyOfRange(bArr, i12, length);
                } else if (i14 != 111) {
                    length = i12 + 3;
                    bArrCopyOfRange = Arrays.copyOfRange(bArr, i12, length);
                } else {
                    length = i12 + 4;
                    bArrCopyOfRange = Arrays.copyOfRange(bArr, i12, length);
                }
                byte[] bArr2 = (byte[]) arrayList.get(i11);
                l lVar = new l(bArrCopyOfRange);
                if (bArr2.length > 0) {
                    lVar.f45920f = true;
                    lVar.f45919e = bArr2;
                } else {
                    lVar.f45920f = false;
                    lVar.f45919e = null;
                }
                lVar.a();
                arrayList3.add(lVar);
                i11++;
                i12 = length;
            }
            bVar = new b(arrayList3);
        }
        arrayList2.addAll(bVar.f5486a);
        i();
    }

    public final void f(byte[] bArr, int i10, int i11) {
        b bVar;
        int length;
        byte[] bArrCopyOfRange;
        ArrayList arrayList = this.f45912c;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        if (bArr == null || i11 == 0) {
            bVar = new b(arrayList2);
        } else {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i11) {
                int i14 = i13 + 2;
                if (i14 >= bArr.length) {
                    break;
                }
                int i15 = bArr[i13] & 255;
                if (i15 != 63) {
                    if (i15 == 95) {
                        length = i14 + (bArr[i13 + 1] & 255);
                        bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, length);
                    } else if (i15 == 108) {
                        length = i13 + 15;
                        bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, length);
                    } else if (i15 == 118) {
                        length = i14 + (bArr[i13 + 1] & 255);
                        bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, length);
                    } else if (i15 == 160) {
                        length = i13 + 6;
                        bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, length);
                    } else if (i15 == 110) {
                        length = i13 + 7;
                        bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, length);
                    } else if (i15 != 111) {
                        length = i13 + 3;
                        bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, length);
                    } else {
                        length = i13 + 4;
                        bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, length);
                    }
                } else if (i10 == 1 || i10 == 2) {
                    byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i13, bArr.length);
                    length = i13 + bArr.length;
                    bArrCopyOfRange = bArrCopyOfRange2;
                } else {
                    length = i13 + 3;
                    bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, length);
                }
                l lVar = new l(bArrCopyOfRange);
                lVar.a();
                arrayList2.add(lVar);
                i12++;
                i13 = length;
            }
            bVar = new b(arrayList2);
        }
        arrayList.addAll(bVar.f5486a);
        i();
    }

    public abstract Task<List<T1>> g(ValueUnit valueUnit);

    @Override // p194p8.j
    public int getChannel() {
        return this.f45911b;
    }

    @Override // p194p8.j
    public final c getLabel() {
        return this.f45913d;
    }

    @Override // p194p8.j
    public final String getName() {
        c cVar = this.f45913d;
        if (cVar != null) {
            return cVar.e(-1);
        }
        return null;
    }

    public abstract Task<List<T1>> h(String str, ValueUnit valueUnit);

    public final void i() {
        if (this.f45913d == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f45912c;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((T1) arrayList.get(i10)).f42678a = this.f45913d.e(i10);
            i10++;
        }
    }
}
