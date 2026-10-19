package p005a4;

import com.facebook.appevents.AppEvent;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import p165n4.a;

/* JADX INFO: compiled from: SessionEventsState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f8044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f8046c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f8047d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8048e;

    public u(a aVar, String str) {
        this.f8044a = aVar;
        this.f8045b = str;
    }

    public final synchronized void a(AppEvent event) {
        try {
            i.e(event, "event");
            if (this.f8046c.size() + this.f8047d.size() >= 1000) {
                this.f8048e++;
            } else {
                this.f8046c.add(event);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
