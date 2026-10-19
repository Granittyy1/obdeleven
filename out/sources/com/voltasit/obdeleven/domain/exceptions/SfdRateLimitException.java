package com.voltasit.obdeleven.domain.exceptions;

import D8.a;
import com.voltasit.obdeleven.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: SfdRateLimitException.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SfdRateLimitException extends Throwable implements a {
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: SfdRateLimitException.kt */
    public static final class Type {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Type f30427b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Type f30428c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Type f30429d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Type f30430e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Type[] f30431f;

        static {
            Type type = new Type("Hour", 0);
            f30427b = type;
            Type type2 = new Type("Day", 1);
            f30428c = type2;
            Type type3 = new Type("VinDay", 2);
            f30429d = type3;
            Type type4 = new Type("Second", 3);
            f30430e = type4;
            Type[] typeArr = {type, type2, type3, type4};
            f30431f = typeArr;
            kotlin.enums.a.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f30431f.clone();
        }
    }

    public SfdRateLimitException(Type type, String str) {
        super(str);
        this.type = type;
    }

    @Override // D8.a
    public final int a() {
        int iOrdinal = this.type.ordinal();
        if (iOrdinal == 0) {
            return R.string.dialog_sfd_error_hour_limit_reached;
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return R.string.dialog_sfd_error_vin_limit_for_day_reached;
        }
        if (iOrdinal == 3) {
            return R.string.dialog_sfd_error_one_sec_limit_reached;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Type b() {
        return this.type;
    }
}
