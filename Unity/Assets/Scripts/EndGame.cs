// using System.Collections;
// using System.Collections.Generic;
// using UnityEngine;

// public class EndGame : MonoBehaviour
// {
//     // Score thresholds
//     int scores = 1000;
//     int twoStar = 500;
//     int oneStar = 200;

//     public Image Background;
//     Sprite GOOD, GREAT, EXCELLENT;
//     // Start is called before the first frame update
//     void Start()
//     {
//         GOOD = Images.Load<Sprite>("good");
//         GREAT = Images.Load<Sprite>("great");
//         EXCELLENT = Images.Load<Sprite>("excellent");
//         initiateBackground();
    
        
//     }

//     // Update is called once per frame
//     void Update()
//     {
        
//     }

//     void initiateBackground(){
//         if(scores >= twoStar){
//             Background.sprite(GOOD);
//         }
//         else if (scores >= oneStar){
//             Background.sprite(GREAT);
//         } 
//         else {
//             Background.sprite(EXCELLENT);
//         }
//         Background.SetActive(true);
//     }
// }
