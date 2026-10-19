package com.google.firebase.perf.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public abstract class StorageUnit {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final StorageUnit f28486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final StorageUnit f28487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final StorageUnit f28488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ StorageUnit[] f28489e;
    long numBytes;

    /* JADX INFO: Fake field, exist only in values array */
    StorageUnit EF5;

    /* JADX INFO: renamed from: com.google.firebase.perf.util.StorageUnit$1, reason: invalid class name */
    public final enum AnonymousClass1 extends StorageUnit {
    }

    /* JADX INFO: renamed from: com.google.firebase.perf.util.StorageUnit$2, reason: invalid class name */
    public final enum AnonymousClass2 extends StorageUnit {
    }

    /* JADX INFO: renamed from: com.google.firebase.perf.util.StorageUnit$3, reason: invalid class name */
    public final enum AnonymousClass3 extends StorageUnit {
    }

    /* JADX INFO: renamed from: com.google.firebase.perf.util.StorageUnit$4, reason: invalid class name */
    public final enum AnonymousClass4 extends StorageUnit {
    }

    /* JADX INFO: renamed from: com.google.firebase.perf.util.StorageUnit$5, reason: invalid class name */
    public final enum AnonymousClass5 extends StorageUnit {
    }

    static {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(0, 1099511627776L, "TERABYTES");
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(1, 1073741824L, "GIGABYTES");
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(2, 1048576L, "MEGABYTES");
        f28486b = anonymousClass3;
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(3, 1024L, "KILOBYTES");
        f28487c = anonymousClass4;
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(4, 1L, "BYTES");
        f28488d = anonymousClass5;
        f28489e = new StorageUnit[]{anonymousClass1, anonymousClass2, anonymousClass3, anonymousClass4, anonymousClass5};
    }

    public StorageUnit() {
        throw null;
    }

    public StorageUnit(int i10, long j, String str) {
        super(str, i10);
        this.numBytes = j;
    }

    public static StorageUnit valueOf(String str) {
        return (StorageUnit) Enum.valueOf(StorageUnit.class, str);
    }

    public static StorageUnit[] values() {
        return (StorageUnit[]) f28489e.clone();
    }

    public final long a(long j) {
        return (j * this.numBytes) / f28487c.numBytes;
    }
}
