package W8;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.widget.TextView;
import com.voltasit.obdeleven.interfaces.SimpleAnimationListener;
import com.voltasit.obdeleven.ui.module.g;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements SimpleAnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Animation f7072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7074d;

    public /* synthetic */ c(Object obj, Object obj2, Animation animation, int i10) {
        this.f7071a = i10;
        this.f7073c = obj;
        this.f7074d = obj2;
        this.f7072b = animation;
    }

    @Override // com.voltasit.obdeleven.interfaces.SimpleAnimationListener
    public final void a(SimpleAnimationListener.AnimationState animationState) {
        switch (this.f7071a) {
            case 0:
                TextView this_textChange = (TextView) this.f7073c;
                i.e(this_textChange, "$this_textChange");
                Y8.b textChange = (Y8.b) this.f7074d;
                i.e(textChange, "$textChange");
                if (animationState == SimpleAnimationListener.AnimationState.f31115c) {
                    Resources resources = this_textChange.getResources();
                    i.d(resources, "getResources(...)");
                    this_textChange.setText(textChange.a(resources));
                    this_textChange.startAnimation(this.f7072b);
                }
                break;
            default:
                SimpleAnimationListener.AnimationState animationState2 = SimpleAnimationListener.AnimationState.f31115c;
                g gVar = (g) this.f7073c;
                if (animationState != animationState2) {
                    gVar.getClass();
                } else {
                    gVar.f34105n.setImageDrawable((Drawable) this.f7074d);
                    gVar.f34105n.startAnimation(this.f7072b);
                }
                break;
        }
    }
}
