package com.example.myrestapi.review;

import java.util.List;

public interface ReviewService {
    List<Review> getReviews();

    Review getReview(Long id);
}