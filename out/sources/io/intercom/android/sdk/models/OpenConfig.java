package io.intercom.android.sdk.models;

import I7.b;
import com.google.android.gms.internal.measurement.M1;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p005a4.p;

/* JADX INFO: compiled from: ConfigModules.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class OpenConfig {
    public static final int $stable = 8;

    @b("form")
    private final OpenForm form;

    @b("open_to")
    private final OpenToSpace openTo;

    @b("spaces")
    private final List<Space> spaces;

    public OpenConfig() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OpenConfig copy$default(OpenConfig openConfig, OpenToSpace openToSpace, List list, OpenForm openForm, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            openToSpace = openConfig.openTo;
        }
        if ((i10 & 2) != 0) {
            list = openConfig.spaces;
        }
        if ((i10 & 4) != 0) {
            openForm = openConfig.form;
        }
        return openConfig.copy(openToSpace, list, openForm);
    }

    public final OpenToSpace component1() {
        return this.openTo;
    }

    public final List<Space> component2() {
        return this.spaces;
    }

    public final OpenForm component3() {
        return this.form;
    }

    public final OpenConfig copy(OpenToSpace openTo, List<Space> spaces, OpenForm form) {
        i.e(openTo, "openTo");
        i.e(spaces, "spaces");
        i.e(form, "form");
        return new OpenConfig(openTo, spaces, form);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenConfig)) {
            return false;
        }
        OpenConfig openConfig = (OpenConfig) obj;
        return this.openTo == openConfig.openTo && i.a(this.spaces, openConfig.spaces) && this.form == openConfig.form;
    }

    public final OpenForm getForm() {
        return this.form;
    }

    public final OpenToSpace getOpenTo() {
        return this.openTo;
    }

    public final List<Space> getSpaces() {
        return this.spaces;
    }

    public int hashCode() {
        return this.form.hashCode() + p.d(this.openTo.hashCode() * 31, 31, this.spaces);
    }

    public String toString() {
        return "OpenConfig(openTo=" + this.openTo + ", spaces=" + this.spaces + ", form=" + this.form + ')';
    }

    public OpenConfig(OpenToSpace openTo, List<Space> spaces, OpenForm form) {
        i.e(openTo, "openTo");
        i.e(spaces, "spaces");
        i.e(form, "form");
        this.openTo = openTo;
        this.spaces = spaces;
        this.form = form;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ OpenConfig(OpenToSpace openToSpace, List list, OpenForm openForm, int i10, e eVar) {
        this((i10 & 1) != 0 ? OpenToSpace.HOME : openToSpace, (i10 & 2) != 0 ? M1.k(new Space(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0)) : list, (i10 & 4) != 0 ? OpenForm.DEFAULT : openForm);
    }
}
