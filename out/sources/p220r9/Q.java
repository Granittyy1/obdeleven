package p220r9;

import android.R;
import android.view.View;
import android.widget.FrameLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: compiled from: UiUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class Q {
    public static void a(SwipeRefreshLayout swipeRefreshLayout, SwipeRefreshLayout.f fVar) {
        swipeRefreshLayout.setOnRefreshListener(fVar);
        swipeRefreshLayout.setColorSchemeResources(R.color.holo_green_dark, R.color.darker_gray);
    }

    public static SwipeRefreshLayout b(View view) {
        SwipeRefreshLayout swipeRefreshLayoutC = c(view);
        swipeRefreshLayoutC.setEnabled(false);
        return swipeRefreshLayoutC;
    }

    public static SwipeRefreshLayout c(View view) {
        SwipeRefreshLayout swipeRefreshLayout = new SwipeRefreshLayout(view.getContext(), null);
        FrameLayout frameLayout = new FrameLayout(view.getContext(), null, com.voltasit.obdeleven.R.style.Root);
        frameLayout.addView(view);
        swipeRefreshLayout.addView(frameLayout);
        return swipeRefreshLayout;
    }
}
