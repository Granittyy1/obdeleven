package O8;

import android.view.View;
import com.voltasit.obdeleven.models.MenuOption;
import com.voltasit.obdeleven.ui.module.BaseFragment;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: MenuProvider.java */
/* JADX INFO: loaded from: classes3.dex */
public interface c {
    default void c(BaseFragment baseFragment) {
        for (View view : h()) {
            Object tag = view.getTag();
            if (view.getVisibility() == 0 && tag != null && (tag instanceof MenuOption) && ((MenuOption) tag).a(baseFragment)) {
                j(view);
                return;
            }
        }
        f();
    }

    default void f() {
        Iterator<View> it = h().iterator();
        while (it.hasNext()) {
            it.next().setSelected(false);
        }
    }

    List<View> h();

    default void j(View view) {
        Iterator<View> it = h().iterator();
        while (it.hasNext()) {
            View next = it.next();
            next.setSelected(next == view);
        }
    }
}
