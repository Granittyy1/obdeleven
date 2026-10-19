package io.intercom.android.sdk.models.carousel;

import Q8.d;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_Carousel extends Carousel {
    private final boolean dismissible;
    private final String instanceId;
    private final List<CarouselScreen> screens;

    public AutoValue_Carousel(List<CarouselScreen> list, boolean z10, String str) {
        if (list == null) {
            throw new NullPointerException("Null screens");
        }
        this.screens = list;
        this.dismissible = z10;
        if (str == null) {
            throw new NullPointerException("Null instanceId");
        }
        this.instanceId = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Carousel)) {
            return false;
        }
        Carousel carousel = (Carousel) obj;
        return this.screens.equals(carousel.getScreens()) && this.dismissible == carousel.isDismissible() && this.instanceId.equals(carousel.getInstanceId());
    }

    @Override // io.intercom.android.sdk.models.carousel.Carousel
    public String getInstanceId() {
        return this.instanceId;
    }

    @Override // io.intercom.android.sdk.models.carousel.Carousel
    public List<CarouselScreen> getScreens() {
        return this.screens;
    }

    public int hashCode() {
        return ((((this.screens.hashCode() ^ 1000003) * 1000003) ^ (this.dismissible ? 1231 : 1237)) * 1000003) ^ this.instanceId.hashCode();
    }

    @Override // io.intercom.android.sdk.models.carousel.Carousel
    public boolean isDismissible() {
        return this.dismissible;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Carousel{screens=");
        sb2.append(this.screens);
        sb2.append(", dismissible=");
        sb2.append(this.dismissible);
        sb2.append(", instanceId=");
        return d.a(sb2, this.instanceId, "}");
    }
}
