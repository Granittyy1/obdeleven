package N5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: compiled from: DrawerLayoutUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DrawerLayout f4647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NavigationView f4648c;

    public b(DrawerLayout drawerLayout, NavigationView navigationView) {
        this.f4647b = drawerLayout;
        this.f4648c = navigationView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        NavigationView navigationView = this.f4648c;
        DrawerLayout drawerLayout = this.f4647b;
        drawerLayout.c(navigationView, false);
        drawerLayout.setScrimColor(-1728053248);
    }
}
