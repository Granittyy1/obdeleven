package kotlinx.datetime.internal.format;

import kotlinx.datetime.format.OffsetFields$sign$1;

/* JADX INFO: compiled from: FieldSpec.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class t<Target> extends a<Target, Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f43936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f43939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f43940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l<Target> f43941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f43942g;

    public t(r rVar, int i10, int i11, Integer num, OffsetFields$sign$1 offsetFields$sign$1, int i12) {
        int i13;
        String name = rVar.f43934a.getName();
        num = (i12 & 16) != 0 ? null : num;
        offsetFields$sign$1 = (i12 & 32) != 0 ? null : offsetFields$sign$1;
        kotlin.jvm.internal.i.e(name, "name");
        this.f43936a = rVar;
        this.f43937b = i10;
        this.f43938c = i11;
        this.f43939d = name;
        this.f43940e = num;
        this.f43941f = offsetFields$sign$1;
        if (i11 < 10) {
            i13 = 1;
        } else if (i11 < 100) {
            i13 = 2;
        } else {
            if (i11 >= 1000) {
                throw new IllegalArgumentException(J4.i.c(i11, "Max value ", " is too large"));
            }
            i13 = 3;
        }
        this.f43942g = i13;
    }

    @Override // kotlinx.datetime.internal.format.m
    public final Object a() {
        return this.f43940e;
    }

    @Override // kotlinx.datetime.internal.format.m
    public final b<Target, Integer> b() {
        return this.f43936a;
    }

    @Override // kotlinx.datetime.internal.format.m
    public final l<Target> c() {
        return this.f43941f;
    }

    @Override // kotlinx.datetime.internal.format.m
    public final String getName() {
        return this.f43939d;
    }
}
