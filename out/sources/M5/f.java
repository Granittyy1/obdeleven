package M5;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C0845b;
import java.util.Objects;

/* JADX INFO: compiled from: MaterialBackOrchestrator.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f4573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M5.b f4574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f4575c;

    /* JADX INFO: compiled from: MaterialBackOrchestrator.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public OnBackInvokedCallback f4576a;

        public OnBackInvokedCallback a(final M5.b bVar) {
            Objects.requireNonNull(bVar);
            return new OnBackInvokedCallback() { // from class: M5.e
                public final void onBackInvoked() {
                    bVar.c();
                }
            };
        }

        public void b(M5.b bVar, View view, boolean z10) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.f4576a == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback onBackInvokedCallbackA = a(bVar);
                this.f4576a = onBackInvokedCallbackA;
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z10 ? 1000000 : 0, onBackInvokedCallbackA);
            }
        }

        public void c(View view) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            if (onBackInvokedDispatcherFindOnBackInvokedDispatcher == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f4576a);
            this.f4576a = null;
        }
    }

    /* JADX INFO: compiled from: MaterialBackOrchestrator.java */
    public static class b extends a {

        /* JADX INFO: compiled from: MaterialBackOrchestrator.java */
        public class a implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ M5.b f4577a;

            public a(M5.b bVar) {
                this.f4577a = bVar;
            }

            public final void onBackCancelled() {
                if (b.this.f4576a != null) {
                    this.f4577a.d();
                }
            }

            public final void onBackInvoked() {
                this.f4577a.c();
            }

            public final void onBackProgressed(BackEvent backEvent) {
                if (b.this.f4576a != null) {
                    this.f4577a.b(new C0845b(backEvent));
                }
            }

            public final void onBackStarted(BackEvent backEvent) {
                if (b.this.f4576a != null) {
                    this.f4577a.a(new C0845b(backEvent));
                }
            }
        }

        @Override // M5.f.a
        public final OnBackInvokedCallback a(M5.b bVar) {
            return new a(bVar);
        }
    }

    public f(M5.b bVar, View view) {
        int i10 = Build.VERSION.SDK_INT;
        this.f4573a = i10 >= 34 ? new b() : i10 >= 33 ? new a() : null;
        this.f4574b = bVar;
        this.f4575c = view;
    }

    public final void a(boolean z10) {
        a aVar = this.f4573a;
        if (aVar != null) {
            aVar.b(this.f4574b, this.f4575c, z10);
        }
    }
}
