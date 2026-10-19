package p146l8;

import com.obdeleven.service.enums.ValueUnit;
import com.obdeleven.service.exception.CommandException;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.util.b;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.parse.model.ControlUnitLabelDB;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p121j8.c;
import p134k8.T1;
import p194p8.h;
import p194p8.j;
import p194p8.k;

/* JADX INFO: compiled from: KWP1281Adaptation.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends p146l8.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f44419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f44422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44423h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f44424i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f44425k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f44426l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f44427m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p121j8.c f44428n;

    /* JADX INFO: compiled from: KWP1281Adaptation.java */
    public class a extends h {
        public a(ControlUnit controlUnit, int i10) {
            super(i10, controlUnit);
        }

        @Override // p194p8.h
        public final Task<List<T1>> g(ValueUnit valueUnit) {
            return Task.forResult(a(valueUnit));
        }

        @Override // p194p8.h, p194p8.j
        public final int getChannel() {
            return d.this.f44412a;
        }

        @Override // p194p8.h
        public final Task<List<T1>> h(String str, ValueUnit valueUnit) {
            return null;
        }
    }

    /* JADX INFO: compiled from: KWP1281Adaptation.java */
    public class b implements Continuation<Void, Task<Void>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f44430a;

        public b(String str) {
            this.f44430a = str;
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Task<Void> then(Task<Void> task) throws Exception {
            String strD = com.obdeleven.service.util.b.d(4, this.f44430a);
            d dVar = d.this;
            ControlUnit controlUnit = dVar.f44413b;
            return controlUnit.f29335r.d(String.format("22%02X%s", Integer.valueOf(dVar.f44412a), strD)).continueWith(new e(this));
        }
    }

    /* JADX INFO: compiled from: KWP1281Adaptation.java */
    public class c implements Continuation<Void, Task<Void>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f44432a;

        public c(String str) {
            this.f44432a = str;
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Task<Void> then(Task<Void> task) throws Exception {
            String strD = com.obdeleven.service.util.b.d(4, this.f44432a);
            d dVar = d.this;
            ControlUnit controlUnit = dVar.f44413b;
            return controlUnit.f29335r.d(String.format("2A%02X%s00%s", Integer.valueOf(dVar.f44412a), strD, I.b.j())).continueWith(new f(this));
        }
    }

    /* JADX INFO: renamed from: l8.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: KWP1281Adaptation.java */
    public class C0505d implements Continuation<Void, Task<Void>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Task f44434a;

        public C0505d(Task task) {
            this.f44434a = task;
        }

        @Override // com.parse.boltsinternal.Continuation
        public final Task<Void> then(Task<Void> task) throws Exception {
            return this.f44434a;
        }
    }

    public d(int i10, ControlUnit controlUnit) {
        super(i10, controlUnit);
        this.f44425k = new ArrayList();
        this.f44426l = new ArrayList();
        this.f44419d = new a(controlUnit, i10);
        this.f44422g = false;
    }

    @Override // p146l8.a
    public final Task<Void> a() {
        return Task.forResult(null);
    }

    @Override // p146l8.a
    public final p121j8.c b() {
        return this.f44428n;
    }

    @Override // p146l8.a
    public final String c() {
        return Integer.toString(this.f44421f);
    }

    @Override // p146l8.a
    public final String d() {
        return Integer.toString(this.f44420e);
    }

    @Override // p146l8.a
    public final Task<j> e() {
        return Task.forResult(this.f44419d);
    }

    @Override // p146l8.a
    public final Task<String> f(final boolean z10) {
        Task<String> taskContinueWithTask = this.f44414c.continueWithTask(new Continuation() { // from class: l8.b
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) {
                d dVar = this.f44415a;
                if (dVar.f44428n != null || !z10) {
                    return Task.forResult(null);
                }
                ControlUnitLabelDB.Type type = ControlUnitLabelDB.Type.f34411d;
                return c.a(dVar.f44412a, dVar.f44413b, type).continueWith(new g(dVar));
            }
        }).continueWithTask(new com.parse.b(8, this)).continueWithTask(new Continuation() { // from class: l8.c
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) throws CommandException {
                int i10;
                d dVar = this.f44417a;
                dVar.getClass();
                byte[] bArrE = b.e((String) task.getResult());
                int i11 = 1;
                if (bArrE.length > 1) {
                    int i12 = bArrE[0] & 255;
                    if (i12 == 230) {
                        if (bArrE.length >= 4) {
                            dVar.f44420e = ((bArrE[2] & 255) * 256) + (bArrE[3] & 255);
                        }
                        int length = bArrE.length;
                        ArrayList arrayList = dVar.f44426l;
                        if (length > 4) {
                            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrE, 4, bArrE.length);
                            int i13 = bArrCopyOfRange[0] & 255;
                            ArrayList arrayList2 = dVar.f44425k;
                            if (i13 == 2) {
                                dVar.j = true;
                                arrayList2.clear();
                                arrayList.clear();
                                int length2 = bArrCopyOfRange.length;
                                while (i11 < length2) {
                                    k kVar = new k();
                                    kVar.f45916a = bArrCopyOfRange[i11];
                                    int i14 = i11 + 2;
                                    kVar.f45917b = bArrCopyOfRange[i11 + 1];
                                    int i15 = i11 + 3;
                                    byte b10 = bArrCopyOfRange[i14];
                                    arrayList.add(b10 == 0 ? new byte[0] : Arrays.copyOfRange(bArrCopyOfRange, i15, i15 + b10));
                                    i11 = i15 + b10;
                                    arrayList2.add(kVar);
                                }
                                return dVar.f(z10);
                            }
                            if (i13 == 231) {
                                byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArrCopyOfRange, 1, bArrE.length);
                                dVar.f44424i = bArrCopyOfRange2;
                                dVar.f44423h = bArrCopyOfRange2.length / 3;
                            } else if (i13 != 244) {
                                dVar.f44423h = 0;
                                dVar.f44424i = null;
                                dVar.j = false;
                                arrayList2.clear();
                                arrayList.clear();
                            } else {
                                int length3 = bArrCopyOfRange.length;
                                dVar.f44423h = 0;
                                dVar.f44424i = new byte[(length3 - 1) * 3];
                                int i16 = 0;
                                int i17 = 1;
                                while (i17 < length3) {
                                    if (dVar.j) {
                                        k kVar2 = (k) arrayList2.get(dVar.f44423h);
                                        byte[] bArr = dVar.f44424i;
                                        int i18 = i16 + 1;
                                        bArr[i16] = kVar2.f45916a;
                                        i10 = i16 + 2;
                                        bArr[i18] = kVar2.f45917b;
                                    } else {
                                        byte[] bArr2 = dVar.f44424i;
                                        int i19 = i16 + 1;
                                        bArr2[i16] = 0;
                                        i10 = i16 + 2;
                                        bArr2[i19] = 0;
                                    }
                                    dVar.f44424i[i10] = bArrCopyOfRange[i17];
                                    i17++;
                                    dVar.f44423h++;
                                    i16 = i10 + 1;
                                }
                            }
                        }
                        boolean z11 = dVar.j;
                        d.a aVar = dVar.f44419d;
                        if (z11) {
                            aVar.e(dVar.f44423h, dVar.f44424i, arrayList);
                        } else {
                            aVar.f(dVar.f44424i, 1, dVar.f44423h);
                        }
                        if (!dVar.f44422g) {
                            dVar.f44421f = dVar.f44420e;
                            dVar.f44422g = true;
                        }
                        return Task.forResult(Integer.toString(dVar.f44420e));
                    }
                    if (i12 == 10) {
                        throw new CommandException(0);
                    }
                }
                throw new CommandException(-1);
            }
        });
        this.f44414c = taskContinueWithTask.makeVoid();
        return taskContinueWithTask;
    }

    @Override // p146l8.a
    public final Task<Void> g(String str) {
        if (this.f44412a == 0) {
            this.f44427m = str;
            return Task.forResult(null);
        }
        Task taskContinueWithTask = this.f44414c.continueWithTask(new b(str));
        this.f44414c = taskContinueWithTask;
        return taskContinueWithTask;
    }

    @Override // p146l8.a
    public final Task<Void> h(String str) {
        String str2 = this.f44427m;
        Task<Void> taskOnSuccessTask = this.f44414c.continueWithTask(new C0505d((str2 == null || !str2.equals(str)) ? g(str) : Task.forResult(null))).onSuccessTask(new c(str));
        this.f44414c = taskOnSuccessTask;
        return taskOnSuccessTask;
    }
}
