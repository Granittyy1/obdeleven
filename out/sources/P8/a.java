package P8;

import p302y6.E;
import p302y6.w;

/* JADX INFO: compiled from: CrashlyticsLogger.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements d {
    @Override // P8.d
    public final void b(int i10, String str, String str2) {
        String str3;
        switch (i10) {
            case 2:
                str3 = "V";
                break;
            case 3:
                str3 = "D";
                break;
            case 4:
                str3 = "I";
                break;
            case 5:
                str3 = "W";
                break;
            case 6:
                str3 = "E";
                break;
            case 7:
                str3 = "A";
                break;
            default:
                str3 = "?";
                break;
        }
        String str4 = str3 + "/" + str + ": " + str2;
        E e10 = p252u6.e.a().f47436a;
        long jCurrentTimeMillis = System.currentTimeMillis() - e10.f48301d;
        com.google.firebase.crashlytics.internal.common.a aVar = e10.f48304g;
        aVar.getClass();
        aVar.f28086e.a(new w(aVar, jCurrentTimeMillis, str4));
    }

    @Override // P8.d
    public final void c(Throwable th) {
    }
}
