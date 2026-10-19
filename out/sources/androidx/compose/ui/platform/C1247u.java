package androidx.compose.ui.platform;

import android.view.View;

/* JADX INFO: renamed from: androidx.compose.ui.platform.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1247u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1247u f15094a = new C1247u();

    public final boolean a(View view, androidx.compose.ui.draganddrop.g gVar, androidx.compose.ui.draganddrop.a aVar) {
        gVar.getClass();
        return view.startDragAndDrop(null, aVar, null, 0);
    }
}
