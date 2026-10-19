package p020b7;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: BackButtonHandler.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f20608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View.OnClickListener f20609b;

    public a(ViewGroup viewGroup, View.OnClickListener onClickListener) {
        this.f20608a = viewGroup;
        this.f20609b = onClickListener;
    }

    public final Boolean a(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return null;
        }
        View.OnClickListener onClickListener = this.f20609b;
        if (onClickListener == null) {
            return Boolean.FALSE;
        }
        onClickListener.onClick(this.f20608a);
        return Boolean.TRUE;
    }
}
