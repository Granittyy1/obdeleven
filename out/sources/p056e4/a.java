package p056e4;

import com.facebook.appevents.AppEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: EventDeactivationManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f34731b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f34730a = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f34732c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashSet f34733d = new HashSet();

    /* JADX INFO: renamed from: e4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EventDeactivationManager.kt */
    public static final class C0360a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f34734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f34735b;

        public C0360a() {
            throw null;
        }
    }

    public static final void a(ArrayList events) {
        i.e(events, "events");
        if (f34731b) {
            Iterator it = events.iterator();
            while (it.hasNext()) {
                if (f34733d.contains(((AppEvent) it.next()).c())) {
                    it.remove();
                }
            }
        }
    }
}
