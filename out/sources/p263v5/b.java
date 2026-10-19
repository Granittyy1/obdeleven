package p263v5;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: compiled from: BottomAppBar.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends FloatingActionButton.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f47636b;

    /* JADX INFO: compiled from: BottomAppBar.java */
    public class a extends FloatingActionButton.a {
        public a() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
        public final void b() {
            BottomAppBar bottomAppBar = b.this.f47636b;
            int i10 = BottomAppBar.f26737m;
            bottomAppBar.getClass();
        }
    }

    public b(BottomAppBar bottomAppBar, int i10) {
        this.f47636b = bottomAppBar;
        this.f47635a = i10;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
    public final void a(FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.f47636b.f(this.f47635a));
        floatingActionButton.o(new a(), true);
    }
}
