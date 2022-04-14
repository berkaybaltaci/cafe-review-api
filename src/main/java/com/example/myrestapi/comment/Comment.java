package com.example.myrestapi.comment;

import com.example.myrestapi.review.Review;
import com.example.myrestapi.user.User;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "comment")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "text")
    private String text;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "review_id")
    private Review review;
}