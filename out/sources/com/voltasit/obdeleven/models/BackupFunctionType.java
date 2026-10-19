package com.voltasit.obdeleven.models;

import kotlin.enums.a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.voltasit.obdeleven.models.BackupFunctionType[], still in use, count: 1, list:
  (r0v1 com.voltasit.obdeleven.models.BackupFunctionType[]) from 0x0036: INVOKE (r0v1 com.voltasit.obdeleven.models.BackupFunctionType[]) STATIC call: kotlin.enums.a.a(java.lang.Enum[]):Ba.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):Ba.a<E extends java.lang.Enum<E>> (m)] (LINE:55)
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
/* JADX INFO: compiled from: BackupFunctionType.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class BackupFunctionType {
    CODING("coding"),
    ADAPTATION("adaptation"),
    ADVANCED_INFO("advancedInfo"),
    LIVE_DATA("liveData");

    private final String functionName;

    static {
        a.a(backupFunctionTypeArr);
    }

    public BackupFunctionType(String str) {
        super(str, i);
        this.functionName = str;
    }

    public static BackupFunctionType valueOf(String str) {
        return (BackupFunctionType) Enum.valueOf(BackupFunctionType.class, str);
    }

    public static BackupFunctionType[] values() {
        return (BackupFunctionType[]) f31130f.clone();
    }

    public final String a() {
        return this.functionName;
    }
}
