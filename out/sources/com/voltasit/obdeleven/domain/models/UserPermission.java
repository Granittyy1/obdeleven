package com.voltasit.obdeleven.domain.models;

import com.braze.support.BrazeLogger;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.voltasit.obdeleven.domain.models.UserPermission[], still in use, count: 1, list:
  (r0v1 com.voltasit.obdeleven.domain.models.UserPermission[]) from 0x0099: INVOKE (r0v1 com.voltasit.obdeleven.domain.models.UserPermission[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):Ba.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):Ba.a<E extends java.lang.Enum<E>> (m)] (LINE:154)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: UserPermission.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class UserPermission {
    SKIP_DEVICE_PASSWORD(0),
    RESET_DEVICE_PASSWORD(1),
    SEE_NON_PUBLIC_OCAS(2),
    REPORT_ERROR(3),
    TEST_BUTTON(4),
    SEE_OCA_STATISTICS(6),
    SEE_TESTING_OCA(7),
    SEE_RAW_DATA(8),
    /* JADX INFO: Fake field, exist only in values array */
    USE_OCA_BUILDER(9),
    /* JADX INFO: Fake field, exist only in values array */
    CAN_VIEW_AND_EDIT_ALL_OCAS(10),
    /* JADX INFO: Fake field, exist only in values array */
    IDENTIFY_BMW(11),
    ADD_VEHICLE_IN_GARAGE(12),
    FACTORY_RESET(13),
    UNKNOWN_PERMISSION(BrazeLogger.SUPPRESS);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f30545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final UserPermission[] f30546c;
    private final int id;

    /* JADX INFO: compiled from: UserPermission.kt */
    public static final class a {
    }

    static {
        kotlin.enums.a.a(userPermissionArr);
        f30545b = new a();
        f30546c = values();
    }

    public UserPermission(int i10) {
        super(str, i);
        this.id = i10;
    }

    public static UserPermission valueOf(String str) {
        return (UserPermission) Enum.valueOf(UserPermission.class, str);
    }

    public static UserPermission[] values() {
        return (UserPermission[]) f30557o.clone();
    }

    public final int a() {
        return this.id;
    }
}
