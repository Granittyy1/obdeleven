package com.google.firebase.sessions;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p191p5.B;

/* JADX INFO: compiled from: InstallationId.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f28721c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28723b;

    /* JADX INFO: compiled from: InstallationId.kt */
    public static final class a {
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v0, types: [i7.c, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v14 */
        /* JADX WARN: Type inference failed for: r8v15 */
        /* JADX WARN: Type inference failed for: r8v16 */
        /* JADX WARN: Type inference failed for: r8v17 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v7 */
        /* JADX WARN: Type inference failed for: r9v14 */
        /* JADX WARN: Type inference failed for: r9v2 */
        /* JADX WARN: Type inference failed for: r9v3, types: [i7.c] */
        public final Object a(p108i7.c cVar, ContinuationImpl continuationImpl) {
            InstallationId$Companion$create$1 installationId$Companion$create$1;
            ?? r10;
            String str;
            if (continuationImpl instanceof InstallationId$Companion$create$1) {
                installationId$Companion$create$1 = (InstallationId$Companion$create$1) continuationImpl;
                int i10 = installationId$Companion$create$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    installationId$Companion$create$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    installationId$Companion$create$1 = new InstallationId$Companion$create$1(this, continuationImpl);
                }
            } else {
                installationId$Companion$create$1 = new InstallationId$Companion$create$1(this, continuationImpl);
            }
            Object objA = installationId$Companion$create$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i11 = installationId$Companion$create$1.label;
            String fid = "";
            try {
                try {
                    if (i11 != 0) {
                        if (i11 == 1) {
                            p108i7.c cVar2 = (p108i7.c) installationId$Companion$create$1.L$0;
                            kotlin.b.b(objA);
                            cVar = cVar2;
                        } else {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            String str2 = (String) installationId$Companion$create$1.L$0;
                            kotlin.b.b(objA);
                            cVar = str2;
                        }
                        fid = (String) objA;
                        kotlin.jvm.internal.i.d(fid, "fid");
                        return new k(fid, cVar);
                    }
                    kotlin.b.b(objA);
                    B bA = cVar.a();
                    kotlin.jvm.internal.i.d(bA, "firebaseInstallations.getToken(false)");
                    installationId$Companion$create$1.L$0 = cVar;
                    installationId$Companion$create$1.label = 1;
                    objA = Ta.b.a(bA, installationId$Companion$create$1);
                    cVar = cVar;
                    if (objA == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    String strA = ((p108i7.f) objA).a();
                    r10 = cVar;
                    str = strA;
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                r10 = cVar;
                str = "";
            }
            kotlin.jvm.internal.i.d(str, "try {\n          firebase…e.\n          \"\"\n        }");
            B id = r10.getId();
            kotlin.jvm.internal.i.d(id, "firebaseInstallations.id");
            installationId$Companion$create$1.L$0 = str;
            installationId$Companion$create$1.label = 2;
            objA = Ta.b.a(id, installationId$Companion$create$1);
            cVar = str;
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            fid = (String) objA;
            kotlin.jvm.internal.i.d(fid, "fid");
            return new k(fid, cVar);
        }
    }

    public k(String str, String str2) {
        this.f28722a = str;
        this.f28723b = str2;
    }
}
