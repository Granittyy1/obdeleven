package androidx.core.app;

import android.app.Notification;
import android.widget.RemoteViews;

/* JADX INFO: compiled from: NotificationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class y extends B {

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class a {
        public static Notification.Style a() {
            return new Notification.DecoratedCustomViewStyle();
        }
    }

    @Override // androidx.core.app.B
    public final void apply(o oVar) {
        ((C) oVar).f16678b.setStyle(a.a());
    }

    @Override // androidx.core.app.B
    public final boolean displayCustomViewInline() {
        return true;
    }

    @Override // androidx.core.app.B
    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
    }

    @Override // androidx.core.app.B
    public final RemoteViews makeBigContentView(o oVar) {
        return null;
    }

    @Override // androidx.core.app.B
    public final RemoteViews makeContentView(o oVar) {
        return null;
    }

    @Override // androidx.core.app.B
    public final RemoteViews makeHeadsUpContentView(o oVar) {
        return null;
    }
}
