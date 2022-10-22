using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class PiecesScript : MonoBehaviour
{
    private Vector3 RightPosition;
    public bool InRightPosition;
    public bool Selected;
    // Start is called before the first frame update
    void Start()
    {
        RightPosition = transform.position;
        transform.position = new Vector2(Random.Range(-1.7f,1.7f), Random.Range(-4.3f, -2.3f));
    }

    // Update is called once per frame
    void Update()
    {
        if(Vector2.Distance(transform.position, RightPosition) < 0.35f){
           if(!Selected){
            transform.position = RightPosition;
            InRightPosition = true;
           }
        }
    }
}
