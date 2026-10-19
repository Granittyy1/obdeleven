package p302y6;

import D6.f;
import android.util.Log;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: y6.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CrashlyticsAppQualitySessionsSubscriber.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2813i implements SessionSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I f48376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2812h f48377b;

    public C2813i(I i10, f fVar) {
        this.f48376a = i10;
        this.f48377b = new C2812h(fVar);
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public final boolean a() {
        return this.f48376a.a();
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public final void b(SessionSubscriber.a aVar) {
        Objects.toString(aVar);
        Log.isLoggable("FirebaseCrashlytics", 3);
        C2812h c2812h = this.f48377b;
        String str = aVar.f28673a;
        synchronized (c2812h) {
            if (!Objects.equals(c2812h.f48375c, str)) {
                f fVar = c2812h.f48373a;
                String str2 = c2812h.f48374b;
                if (str2 != null && str != null) {
                    try {
                        fVar.b(str2, "aqs.".concat(str)).createNewFile();
                    } catch (IOException unused) {
                    }
                }
                c2812h.f48375c = str;
            }
        }
    }

    public final void c(String str) {
        C2812h c2812h = this.f48377b;
        synchronized (c2812h) {
            if (!Objects.equals(c2812h.f48374b, str)) {
                f fVar = c2812h.f48373a;
                String str2 = c2812h.f48375c;
                if (str != null && str2 != null) {
                    try {
                        fVar.b(str, "aqs.".concat(str2)).createNewFile();
                    } catch (IOException unused) {
                    }
                }
                c2812h.f48374b = str;
            }
        }
    }
}
