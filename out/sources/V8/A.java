package V8;

import android.view.View;
import android.widget.CheckBox;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.voltasit.obdeleven.presentation.pro.BaseProFragment;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class A implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BaseProFragment f6740d;

    public /* synthetic */ A(BaseProFragment baseProFragment, int i10, int i11) {
        this.f6738b = i11;
        this.f6740d = baseProFragment;
        this.f6739c = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6738b) {
            case 0:
                D d10 = (D) this.f6740d;
                AppCompatCheckBox[] appCompatCheckBoxArr = d10.f6759w;
                int i10 = this.f6739c;
                boolean zIsChecked = appCompatCheckBoxArr[i10].isChecked();
                int i11 = zIsChecked;
                if (!(view instanceof CheckBox)) {
                    i11 = !zIsChecked;
                }
                d10.f6760x.f41191e.e(d10.f6745A, i10, i11);
                d10.X(d10.f6745A);
                break;
            default:
                com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.q qVar = (com.voltasit.obdeleven.presentation.controlUnit.kwp.longcoding.q) this.f6740d;
                AppCompatCheckBox[] appCompatCheckBoxArr2 = qVar.f31855x;
                int i12 = this.f6739c;
                qVar.f31856y.f41191e.e(qVar.f31830A, i12, appCompatCheckBoxArr2[i12].isChecked() ? 1 : 0);
                qVar.X(qVar.f31830A);
                break;
        }
    }
}
