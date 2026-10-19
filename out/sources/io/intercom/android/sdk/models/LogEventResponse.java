package io.intercom.android.sdk.models;

import io.intercom.android.sdk.models.carousel.Carousel;

/* JADX INFO: loaded from: classes3.dex */
public class LogEventResponse extends UsersResponse {
    private final Carousel carousel;

    public LogEventResponse(Builder builder) {
        super(builder);
        Carousel.Builder builder2 = builder.carousel;
        this.carousel = (builder2 == null ? new Carousel.Builder() : builder2).build();
    }

    public Carousel getCarousel() {
        return this.carousel;
    }

    public static final class Builder extends UsersResponse.Builder {
        Carousel.Builder carousel;

        @Override // io.intercom.android.sdk.models.UsersResponse.Builder, io.intercom.android.sdk.models.BaseResponse.Builder
        public LogEventResponse build() {
            return new LogEventResponse(this);
        }
    }
}
